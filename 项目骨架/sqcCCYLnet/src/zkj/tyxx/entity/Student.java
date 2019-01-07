package zkj.tyxx.entity;
/*stu_id int(11) NOT NULL AUTO_INCREMENT,

stu_name varchar(100) NOT NULL,

	stu_sex varchar(5),
stu_num varchar(20) NOT NULL,
stu_dep  varchar(100) NOT NULL,
stu_jtime varchar(20) NOT NULL,
stu_place varchar(50) NOT NULL,
stu_bir varchar(20) NOT NULL,
stu_tel varchar(20) NOT NULL,*/

public class Student {
	
		private int id;
		private String name;
		private String sex;
		private String num;
		private String dep;//系别
		private String jtime;//入团时间
		private String place;//籍贯
		private String bir;//生日
		private String tel;
		public Student() {
			// TODO Auto-generated constructor stub
		}
		public Student(String name, String sex, String num, String dep,
				String jtime,String place,String bir,String tel) {
			super();
			this.name = name;
			this.sex = sex;
			this.num = num;
			this.dep=dep;
			this.jtime=jtime;
			this.place=place;
			this.bir=bir;
			this.tel = tel;
			
		}
		
		public Student(int id,String name, String sex, String num, String dep,
				String jtime,String place,String bir,String tel) {
			super();
			this.id = id;
			this.name = name;
			this.sex = sex;
			this.num = num;
			this.dep=dep;
			this.jtime=jtime;
			this.place=place;
			this.bir=bir;
			this.tel = tel;
			
		}
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getSex() {
			return sex;
		}
		public void setSex(String sex) {
			this.sex = sex;
		}
		public String getNum() {
			return num;
		}
		public void setNum(String num) {
			this.num = num;
		}
		public String getDep() {
			return dep;
		}
		public void setDep(String dep) {
			this.dep = dep;
		}
		public String getJtime() {
			return jtime;
		}
		public void setJtime(String jtime) {
			this.jtime = jtime;
		}
		public String getPlace() {
			return place;
		}
		public void setPlace(String place) {
			this.place = place;
		}
		public String getBir() {
			return bir;
		}
		public void setBir(String bir) {
			this.bir = bir;
		}
		public String getTel() {
			return tel;
		}
		public void setTel(String tel) {
			this.tel = tel;
		}
		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + ", sex=" + sex
					+ ", num=" + num + ", dep=" + dep + ", num=" + num +",jtime="+jtime+", place="+place+",bir="+bir+",tel="+tel +"]";
		}
		
		

	
}
