package cdss.kb.core;

public class Provider extends Core {
    private String id; // 编号
    private String name; // 姓名
    private String role; // 角色: 医生，护士

    public Provider() {
        this.id = "";
        this.name = "";
        this.role = "";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
