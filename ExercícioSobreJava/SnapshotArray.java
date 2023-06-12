///Difficulty:                       MEDIUM 

//Implement a SnapshotArray that supports the following interface:

//SnapshotArray(int length) initializes an array-like data structure with the given length. 
//Initially, each element equals 0.
//void set(index, val) sets the element at the given index to be equal to val.
//int snap() takes a snapshot of the array and returns the snap_id: the total number of times we called snap() minus 1.
//int get(index, snap_id) returns the value at the given index, at the time we took the snapshot with the given snap_id

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

class SnapshotArray 
{
    private List<TreeMap<Integer, Integer>> snapshots;// I could have use it an array of TreeMap instead of an List
    private int snapId;

    public SnapshotArray(int length) 
    {
        snapshots = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            snapshots.add(new TreeMap<>());
            snapshots.get(i).put(0, 0); // Initialize with snapId 0 and value 0
        }
        snapId = 0;
    }

    public void set(int index, int val) 
    {
        TreeMap<Integer, Integer> snapshot = snapshots.get(index);
        snapshot.put(snapId, val);
    }

    public int snap() 
    {
        return snapId++;
    }

    public int get(int index, int snap_id) 
    {
        TreeMap<Integer, Integer> snapshot = snapshots.get(index);
        return snapshot.floorEntry(snap_id).getValue();
    }
}

/**
 * Your SnapshotArray object will be instantiated and called as such:
 * SnapshotArray obj = new SnapshotArray(length);
 * obj.set(index,val);
 * int param_2 = obj.snap();
 * int param_3 = obj.get(index,snap_id);
 */