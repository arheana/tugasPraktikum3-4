class Hero{
    private String name;
    private double hitPoint;
    private double attack;
    private double defense;

    public void setName(String name){
        this.name = name;
    }

    public void setHitPoint(double hitPoint){
        this.hitPoint = hitPoint;
    }

    public void setAttack(double attack){
        this.attack = attack;
    }

    public void setDefense(double defense){
        this.defense = defense;
    }

    public String getName(){
        return name;
    }

    public double getHitPoint(){
        return hitPoint;
    }

    public double getAttack(){
        return attack;
    }

    public double getDefense(){
        return defense;
    }

    public Hero(String name, double hitPoint, double attack, double defense){
        this.name = name;
        this.hitPoint = hitPoint;
        this.attack = attack;
        this.defense = defense;
    }

    public Hero() {
    }

    public void dataHero(){
        System.out.println("Nama        : " + this.name);
        System.out.println("Hitpoint    : " + this.hitPoint);
        System.out.println("Attack      : " + this.attack);
        System.out.println("Defense     : " + this.defense);
        System.out.println("==================================");
    }

    public void attacking(double attack){
        this.hitPoint -= attack;
    }

    public void fight(Hero hero2) {
        System.out.println("Status effect " + this.name + "=> Attack Up");
        System.out.println(this.name + " menyerang " + hero2.name + "sebesar " + this.attack);
        System.out.println(hero2.name + " memiliki pertahanan sebesar " + hero2.defense);
        
        hero2.attacking(this.attack);
        System.out.println();
        if (hero2.hitPoint <= 0) {
            System.out.println("Pertarungan telah usai!");
            System.out.println("hitPoint " + hero2.name + " tersisa " + hero2.hitPoint);
            System.out.println(hero2.name + " telah kalah!");
            System.out.println("===============================");
        }
    }
    
}