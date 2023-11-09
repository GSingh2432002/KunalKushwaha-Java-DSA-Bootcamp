//Find Median from Data Stream
import java.util.PriorityQueue;
class Java166
{
    public static void main(String[] args) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>();
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a, b)->b-a);
        int arr[]={2,3,4};
        for (int i : arr){
            if (!maxHeap.isEmpty() && maxHeap.peek() < i){
                minHeap.offer(i - maxHeap.poll());
                maxHeap.offer(minHeap.poll());
            }else{
                maxHeap.offer(i);
            }
        }
        while(!maxHeap.isEmpty())
        System.out.println(maxHeap.poll());
    }
    class MedianFinder{
    private PriorityQueue<Integer> minHeap;
    private PriorityQueue<Integer> maxHeap;

    public MedianFinder()
    {
        minHeap = new PriorityQueue<>();
        maxHeap = new PriorityQueue<>((a, b) -> b - a);
    }

    public void addNum(int num)
    {
        maxHeap.offer(num);
        minHeap.offer(maxHeap.poll());

        if (maxHeap.size() < minHeap.size()) {
            maxHeap.offer(minHeap.poll());
        }
    }
    public double findMedian()
    {
        if (maxHeap.size() > minHeap.size()) {
            return maxHeap.peek();
        } else {
            return (maxHeap.peek() + minHeap.peek()) / 2.0;
        }
    }
    }
}