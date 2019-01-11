package errorThrow.cats;

public class MassivCats {
    public void MyMethod() {
            NewCat cat[] = new NewCat[10];
            NewCat newCat = new NewCat("Murka");

            for (int c = 1; c < cat.length+1 ; c++) {
                cat[c] = new NewCat("Cat" + c++);
                // cat[11]=null;
            }

        for (int c = 1; c < cat.length+1; c++) {
            if (c>10){
                throw new ArrayIndexOutOfBoundsException();

            }
        }

    }

   public void NPE() {
        NewCat cat[] = new NewCat[10];
        for (int c = 0; c < cat.length; c++) {
            if (cat[c]==null){
                throw new NullPointerException();
            }
        }

    }
}
