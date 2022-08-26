package ArraySnacks7;

public class ArrayElementCheck {
    public boolean arrayHasElement() {
        return true;
    }
    public boolean checkElementsInAnArray(int checkElement, int [] array) {
        for(int checker : array)
            if(checker == checkElement)
                return true;
        return false;
    }
}
