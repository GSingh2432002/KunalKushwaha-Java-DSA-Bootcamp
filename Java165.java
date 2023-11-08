//Minimum number of Refueling stops
import java.util.PriorityQueue;
import java.util.Queue;
class Java165
{
    public static void main(String[] args) {
        int target = 100;
        int startFuel = 10;
        int[][] stations = {{10, 60}, {20, 30}, {30, 30}, {60, 40}};
        int result = minRefuelStops(target,startFuel, stations);
        System.out.println(result);
    }
    public static int minRefuelStops(int target, int startFuel, int[][] stations) {
          if (startFuel >= target) return 0;
        Queue<Integer> queue = new PriorityQueue<>((a,b) -> b-a);
        int i = 0, n = stations.length, stops = 0, maxDistance = startFuel;
        while (maxDistance < target) {
            while (i < n && stations[i][0] <= maxDistance) {
                queue.offer(stations[i++][1]);
            }
            if (queue.isEmpty()) return -1;
            maxDistance += queue.poll();
            stops++;
        }
        return stops;
    }
}