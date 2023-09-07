class Elevator {
    private int currentFloor;
    private boolean movingUp;

    public Elevator() {
        this.currentFloor = 1; // Elevator starts on the first floor
        this.movingUp = true; // Initially, it's moving up
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public boolean isMovingUp() {
        return movingUp;
    }

    public void moveUp() {
        if (currentFloor < 5) {
            currentFloor++;
        }
    }

    public void moveDown() {
        if (currentFloor > 1) {
            currentFloor--;
        }
    }

    public void changeDirection() {
        movingUp = !movingUp;
    }
}

class Building {
    private Elevator elevator;

    public Building() {
        elevator = new Elevator();
    }

    public void callElevator(int destinationFloor) {
        int currentFloor = elevator.getCurrentFloor();
        System.out.println("Current Floor: " + currentFloor);
        if (destinationFloor > currentFloor) {
            while (currentFloor < destinationFloor) {
                elevator.moveUp();
                currentFloor++;
            }
        } else if (destinationFloor < currentFloor) {
            while (currentFloor > destinationFloor) {
                elevator.moveDown();
                currentFloor--;
            }
        }

        // Elevator has reached the destination floor
        System.out.println("Elevator has arrived at Floor " + destinationFloor);
        elevator.changeDirection();
    }
}

public class Elevatorr {
    public static void main(String[] args) {
        Building building = new Building();

        building.callElevator(3); // Call the elevator to Floor 3
        building.callElevator(5); // Call the elevator to Floor 5
    }
}
