public class Fighter {
    String name;
    int damege;
    int health;
    int weight;
    Fighter(String name,int damege,int  health,int weight){
        this.name=name;
        this.damege=damege;
        this.health=health;
        this.weight=weight;
    }
    int hit(Fighter foe) {
        System.out.println(this.name + "=>"  + foe.name + " " + this.damege + " hasar vurdu.");
        if(foe.health-this.damege<0){
            return 0;
        }
        return  foe.health-this.damege;
    }
}
