package Chapter9HomeWork;

public class FreezerTester
{
    public static void main(String[] args)
    {
        //Make objects to do work:
        Freezer firstFreezer = new Freezer();
        Freezer secondFreezer = new Freezer();
        
    /////////////////////////////////////////////////////
        //This is Steve Job as launderer: knows english, how to take a cap, and do laundry...etc
            //Give characteristic, their experties etc of those object.
        //Objectify object1 //Define it, what is it's status?
        firstFreezer.setIsOn(true);
        firstFreezer.getFAST();
        firstFreezer.setSize(28.5);
        
        //Objectify secondFreezer //Define it, what is it's status?
        secondFreezer.setIsOn(false);
        secondFreezer.getMEDIUM();
        secondFreezer.setSize(19.5);
        secondFreezer.setColor("StainlessSteel");
        
    //////////////////////////////////////////////////////////////////////////
        //went to (toString) the laundry and now (Sys.out) gimme those dry cloths.
        //Print them
        System.out.println(firstFreezer.toString());
        System.out.println(secondFreezer.toString());

    }
}
