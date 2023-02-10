package com.directi.training.ocp.exercise_refactored;

public abstract class ResourceAllocator {
    public int allocate() {
        int resourceId = findFreeSlot();
        markSlotBusy(resourceId);
        return resourceId;
    }
    public void free(int resourceId) {
        markSlotFree(resourceId);
    }
    protected abstract int findFreeSlot();
    protected abstract void markSlotBusy(int resourceId);
    protected abstract void markSlotFree(int resourceId);
}
