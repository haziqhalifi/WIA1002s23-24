package lecture;
// polymorphism = many shapes
// can use object from child class anywhere you would an object of parent class

class Plant {
    public void grow(){
        System.out.println("Plant is growing...");
    }
}

class Tree extends Plant {
    @Override
    public void grow(){
        System.out.println("Tree is growing...");
    }
    
    public void shedLeaves(){
        System.out.println("Tree is shedding leaves ...");
    }
}

public class Note1 {

    public static void main(String[] args) {
        Plant plant1 = new Plant();
        //Datatype(Plant) instance/variable(Plant) = object creation(Plant)
        plant1.grow();
        Tree tree1 = new Tree();
        tree1.grow();
        Plant plant2 = plant1;
        plant2.grow();
        Plant plant3 = tree1; //this is polymorphism
        plant3.grow();
        //Datatype(Plant) variable(Plant) = object creation(Tree);
        //plant3.shedLeaves();  //plant3 cannot access the shedLeaves method because of plant3 are from Plant datatype. Shedleaves method is not overriden.
    }
}
