public class MoveStrAtEnd {

    public MoveStrAtEnd() {
    }

    public void moveBAtEnd(String[] arr) {
        int n = arr.length;
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != "B" && arr[j] == "B") {
                String temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if (arr[j] != "B") {
                j++;
            }
            for (String k : arr) {
                System.out.print(k + ' ');
            }
            System.out.print("\n");
        }
    }
}