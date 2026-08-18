class Solution {
    public int calPoints(String[] operations) {
        int sum = 0;
        int prod = 1;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < operations.length; i++) {
            String s = operations[i];

            if (s.equals("+")) {
                int last = list.get(list.size() - 1);
                int secondLast = list.get(list.size() - 2);
                sum = last + secondLast;
                list.add(sum);

            } else if (s.equals("D")) {
                int last = list.get(list.size() - 1);
                prod = 2 * last;
                list.add(prod);

            } else if (s.equals("C")) {
                list.remove(list.size() - 1);

            } else {
                list.add(Integer.parseInt(s));
            }
        }

        int total = 0;
        for (int score : list) {
            total += score;
        }

        return total;
    }
}