public class App {
    public static void main(String[] args){

        int [] nums = {2,7,11,15};
        int target = 9;

        Solution solution = new Solution();
        int[] result = solution.findTwoSum(nums, target);

        if (result.length == 2) {
            System.out.println("Índices encontrados: " + result[0] + " e " + result[1]);
        } else {
            System.out.println("Nenhuma solução encontrada.");
        }
    }
}
