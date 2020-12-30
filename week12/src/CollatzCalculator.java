class CollatzCalculator {

    int computeStepCount(int start) {
        int count = 0;
        if (start < 0) {
            throw new IllegalArgumentException("Only natural numbers are allowed");
        }

        while (start != 1){
            if (start % 2 == 0){
                start /= 2;
            }else {
                start = (start * 3) + 1;
            }
            count++;
        }

        return count;
    }

}