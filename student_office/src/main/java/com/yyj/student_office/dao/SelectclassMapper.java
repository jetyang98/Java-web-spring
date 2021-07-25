package com.yyj.student_office.dao;

import com.yyj.student_office.pojo.EnteringGrades;
import com.yyj.student_office.pojo.StudentSelectClass;
import com.yyj.student_office.pojo.Selectclass;

import java.util.List;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface SelectclassMapper {
	
	
	@Select("select DISTINCT class.class_id  ,  class.class_name  , class.teacher_id , teacher.teacher_name  ,class.class_address , class.class_time \r\n" + 
			"		FROM class ,teacher\r\n" + 
			"	where class_id NOt in(SELECT class_id FROM selectclass where student_id=#{student_id}) AND teacher.teacher_id=class.teacher_id;")
	List<StudentSelectClass> Getselectclass(String student_id);
	
	
	@Select("select  class.class_id  ,  class.class_name  , class.teacher_id , teacher.teacher_name  ,class.class_address , class.class_time \r\n" + 
			"		FROM selectclass\r\n" + 
			"	LEFT JOIN	 class ON selectclass.class_id=class.class_id \r\n" + 
			"	LEFT JOIN  teacher ON  teacher.teacher_id=class.teacher_id\r\n" + 
			"	where  selectclass.student_id=#{student_id};")
	List<StudentSelectClass> Getselectclassresult(String student_id);
	
	
	@Select("insert into selectclass (class_id, student_id, score)\r\n" + 
			"    values (#{class_id}, #{student_id},null)")
	void Studentselect(Selectclass selectclass) ;
	
	
	@Select("select  class.class_id  ,  class.class_name  , class.teacher_id , teacher.teacher_name  ,class.class_address , class.class_time ,selectclass.score\r\n" + 
			"	FROM selectclass\r\n" + 
			"	LEFT JOIN	 class ON selectclass.class_id=class.class_id \r\n" + 
			"	LEFT JOIN  teacher ON  teacher.teacher_id=class.teacher_id\r\n" + 
			"	where  selectclass.student_id=#{student_id};")
	List<StudentSelectClass> Getclassscore(String student_id);
	
	
	@Select(" select  class.class_id  ,  class.class_name  , selectclass.student_id , student_name  , selectclass.score\r\n" + 
			"		FROM teacher\r\n" + 
			"	LEFT JOIN	 class ON teacher.teacher_id=class.teacher_id \r\n" + 
			"	LEFT JOIN  selectclass ON  selectclass.class_id=class.class_id\r\n" + 
			"	LEFT JOIN  student ON  student.student_id=selectclass.student_id\r\n" + 
			"	where  teacher.teacher_id=#{teacher_id};")
	List<EnteringGrades> getEnteringGrades(String teacher_id);
	
	
	@Update(" update selectclass\r\n" + 
			"    set \r\n" + 
			"      score = #{score,jdbcType=DOUBLE}\r\n" + 
			"    where class_id = #{class_id,jdbcType=VARCHAR} and\r\n" + 
			"      student_id = #{student_id,jdbcType=VARCHAR}")
	void AddSelectclassscore(Selectclass selectclass);

	
}