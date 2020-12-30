class ResistorColor {

    public ResistorColor(){};

    public int colorCode(String color) {
        // add you code here
        String[] a = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        int i;
        for ( i=0; i<9; i++){
            if (color.equals(a[i])){
                return i;
            }

        }
        return i;
    }

    public String[] colors() {
        // add your code here
        String[] a = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        return a;
    }
}