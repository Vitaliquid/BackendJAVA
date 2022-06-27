public class Wizard {
            //Características - Campos
        public Integer id;
        public String name, house, gender, boggart, patronus;

             //Características - Métodos
        public Integer getId(){ return id; }
        public String getName(){ return name;}
        public String getHouse(){ return house;}
        public String getGender(){ return gender; }
        public String getBoggart(){ return boggart;}
        public String getPatronus(){ return patronus;}


              //Características - Métodos (firma con signatura del método para no tener ambiguedad)
        public boolean setId (int id){
            if(id > 0){
                this.id = id;
                return true;
            }   else
                return false;

        }
        public boolean setName(String name){
        if(!name.isEmpty()){
            this.name = name;
            return true;
        }  else
            return false;
    }

        public boolean setHouse(String house){
        if(!house.isEmpty()){
            this.house = house;
            return true;
        }  else
            return false;

        }

        public boolean setGender(String gender){
        if(!gender.isEmpty()){
            this.gender = gender;
            return true;
        }  else
            return false;

    }

        public boolean setBoggart(String boggart){
        if(!boggart.isEmpty()){
            this.boggart = boggart;
            return true;
        }  else
            return false;

    }

        public boolean setPatronus(String patronus){
        if(!patronus.isEmpty()){
            this.patronus = patronus;
            return true;
        }  else
            return false;

    }


        public String printState(){
            return "id: "+id+"\n"+
                    "name: "+name+"\n"+
                    "house: "+house+"\n"+
                    "gender: "+gender+"\n"+
                    "boggart: "+boggart+"\n"+
                    "patronus: "+patronus;
        }
    }

