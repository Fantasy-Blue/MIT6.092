
class Marathon {

    public static int findIndexOfFastest(int[] times) {
        int index = 0;
        for (int i = 1; i < times.length; i++) {
            if (times[i] < times[index]) {
                index = i;
            }
        }
        return index;
    }

    public static int findIndexOfSecFastest(int[] times) {
        int fastestIndex = findIndexOfFastest(times);
        int index = 0;
        if (index == fastestIndex) {
            index = 1;
        }
        for (int i = index + 1; i < times.length; i++) {
            if (i == fastestIndex) {
                continue;
            }
            if (times[i] < times[index]) {
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] arguments) {
        String[] names = {
            "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
            "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
            "Aaron", "Kate"
        };

        int[] times = {
            341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
            343, 317, 265
        };

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + ": " + times[i]);
        }

        int fastestindex = findIndexOfFastest(times);
        System.out.println(names[fastestindex] + ": " + times[fastestindex]);

        int Secfastestindex = findIndexOfSecFastest(times);
        System.out.println(names[Secfastestindex] + ": " + times[Secfastestindex]);
    }
}
