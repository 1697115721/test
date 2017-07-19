/**
 * @author lsp
 * @version V1.0
 * @Date 2016-8-11 上午9:24:47
 * @Description: TODO(用一句话描述该文件做什么)
 */
public class TUserInfo {
	private int id;
	private String name;
	private int age;
    public TUserInfo(){}
    public TUserInfo(int id,String name,int age){
    	this.id=id;
    	this.name=name;
    	this.age=age;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public String toString() {
		return "TUserInfo [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

}
