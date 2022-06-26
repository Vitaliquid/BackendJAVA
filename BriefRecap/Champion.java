package BriefRecap;

public class Champion {
    private int id;
    private String name;
    private String role;
    private String difficulty;
    private String description;

    public Champion (int id, String name, String role, String difficulty, String description){
        this.id = id;
        this.name = name;
        this.role = role;
        this.difficulty = difficulty;
        this.description = description;
    }
    public int getId(){   return id;  }
    public String getName(){   return name;   }
    public String getRole(){   return role;   }
    public String getDifficulty(){   return difficulty;   }
    public String getDescription(){   return description;   }

    public boolean setId(int id){
        if(id > 0){
            this.id=id;
            return true;
        } else
            return false;
    }

    public boolean setName (String name){
        if(!name.isEmpty()){
            this.name = name;
            return true;
        } else
            return false;

    }

    public boolean setRole(String Role){
        if(!role.isEmpty()){
            this.role = role;
            return true;
        } else
            return false;
    }

    public boolean setDifficulty(String difficulty){
        if(!difficulty.isEmpty()){
            this.difficulty = difficulty;
            return true;
        } else
            return false;
    }

    public String showMessage(){
        return
                "id: "+id+
                        " name: "+name+
                        " role: "+role+
                        " difficulty: "+difficulty+
                        "\ndescription: "+description+"\n";
    }
}

