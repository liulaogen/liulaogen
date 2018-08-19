package zizai.controller;

import java.util.*;
import javax.annotation.Resource;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import zizai.model.Student;
import zizai.service.StudentService;

import static org.springframework.expression.common.ExpressionUtils.toInt;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Resource
    private StudentService studentService;

    @ResponseBody
    @RequestMapping("rank")
    public List<Student> rank() {
        //1.获取学生列表
        List<Student> list = studentService.rank();
        /*Map<Integer,Integer> map = new TreeMap<Integer,Integer>(new Comparator<Integer>() {
					public int compare(Integer obj1, Integer obj2) {
						// 降序排序
						return obj2.compareTo(obj1);
					}
				});
		//2.计算总成绩
		for(int x=0;x<list.size();x++){
			Student student=list.get(x);
			Integer sum=(student.getChinese()+student.getEnglish()+student.getMath());
			map.put(sum,student.getId());
		}
		//3.按照成绩排序
		Set<Integer> keySet = map.keySet();
		Iterator<Integer> iter = keySet.iterator();
		while (iter.hasNext()) {
			Integer key = iter.next();
			System.out.println(key + ":" + map.get(key));
		}*/
        Collections.sort(list, new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                return s1.getChinese().compareTo(s2.getChinese());
            }
        });
        return list;
    }


    @RequestMapping("toAddPage")
    public ModelAndView toAddPage() {
        return new ModelAndView("addStu");
    }

    @RequestMapping("/addStu")
    public ModelAndView addStu(HttpServletRequest request, Model model) {
        Student student = new Student();
        String name = request.getParameter("name");
        String age = request.getParameter("age");
        String sex = request.getParameter("sex");
        String chinese = request.getParameter("chinese");
        String math = request.getParameter("math");
        String english = request.getParameter("english");
        student.setName(name);
        student.setAge(age);
        student.setSex(sex);
        student.setChinese(chinese);
        student.setMath(math);
        student.setEnglish(english);
        String url = "";
        int i = this.studentService.addStu(student);
        if (i > 0) {
            url = "success";
        }
        ModelAndView view = new ModelAndView(url);
        return view;
    }

    @RequestMapping("/delStu")
    public ModelAndView delStu(HttpServletRequest request, Model model) {
        String id = request.getParameter("id");
        int id1 = Integer.valueOf(id);
        int i = this.studentService.DelStu(id1);
        String url = "delStu";
        ModelAndView view = new ModelAndView(url);
        return view;
    }

    @RequestMapping("/updateStu")
    public String updateStu(HttpServletRequest request, Model model) {
        int id = new Integer(request.getParameter("id"));
        String name = request.getParameter("name");
        String age = request.getParameter("age");
        String sex = request.getParameter("sex");
        String chinese = request.getParameter("chinese");
        String math = request.getParameter("math");
        String english = request.getParameter("english");


        //Integer chinese=Integer.parseInt(request.getParameter("chinese"));
        //Integer math=Integer.parseInt(request.getParameter("chinese"));
        //Integer english=Integer.parseInt(request.getParameter("chinese"));
    /*if ((request.getParameter("chinese"))!=null){
        Integer chinese=Integer.parseInt(request.getParameter("chinese"));
        student.setChinese(chinese);}
    else{}
    if ((request.getParameter("math"))!=null){
        Integer chinese=Integer.parseInt(request.getParameter("math"));
        student.setChinese(chinese);}
    else{}
    if ((request.getParameter("english"))!=null){
        Integer chinese=Integer.parseInt(request.getParameter("english"));
        student.setChinese(chinese);}
    else{}
    */
        Student student = new Student();
        student.setAge(age);
        student.setId(id);
        student.setName(name);
        student.setSex(sex);
        student.setChinese(chinese);
        student.setMath(math);
        student.setEnglish(english);
        int i = this.studentService.updateStu(student);
        return "success";
    }

    @RequestMapping("/selectStudentByID")
    public ModelAndView selectStudentByID(HttpServletRequest request, Model model) {
        int id = new Integer(request.getParameter("id"));
        Student student = this.studentService.selectStudentByID(id);
        ModelAndView view = new ModelAndView();
        view.setViewName("updateStu");
        view.addObject("student", student);
        return view;
    }


    @RequestMapping("/getAllStu")
    public ModelAndView getAllStu() {
        List<Student> students = new ArrayList<Student>();
        students = this.studentService.getAllStu();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("Studentlist");
        modelAndView.addObject("xxx", students);
        return modelAndView;
    }

    @RequestMapping("/getStudentByName")
    public ModelAndView getStudentByName(HttpServletRequest request, Model model) {
        String name = request.getParameter("name");
        List<Student> students = new ArrayList<Student>();
        if (name != null) {
            students = this.studentService.getStuByName(name);

        }
        ModelAndView view = new ModelAndView();
        view.setViewName("getStudentByName");
        view.addObject("xxx", students);
        return view;
    }

    @RequestMapping("/up")
    public String up(HttpServletRequest request, Model model) {
        return "Studentlist";
    }

}
