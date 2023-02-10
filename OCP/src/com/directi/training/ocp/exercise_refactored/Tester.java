package com.directi.training.ocp.exercise_refactored;

public class Tester {
    public void allocateResources() {
        ResourceAllocator timeAllocator = new TimeResourceAllocator();
        ResourceAllocator spaceAllocator = new SpaceResourceAllocator();
        int timeResource = timeAllocator.allocate();
        int spaceResource = spaceAllocator.allocate();
        // do something with the resources
        timeAllocator.free(timeResource);
        spaceAllocator.free(spaceResource);
    }
}