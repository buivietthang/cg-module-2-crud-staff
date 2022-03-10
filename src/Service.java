import java.util.ArrayList;
import java.util.List;

public class Service {
    List<Staff> staffList = new ArrayList<>();

    public void creatStaff(Staff staff) {
        staffList.add(staff);
    }

    public void updateStaff(int index, Staff staff) {
        staffList.set(index, staff);
    }

    public void deleteStaff(int index) {
        staffList.remove(index);
    }

    public int findIndexById(int id) {
        for (int i = 0; i < staffList.size(); i++) {
            if (id == staffList.get(i).getId()) {
                return i;
            }
        }
        return -1;
    }

    public void show() {
        for (Staff staff : staffList) {
            System.out.println(staff);
        }
    }
}
