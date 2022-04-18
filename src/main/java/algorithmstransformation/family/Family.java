package algorithmstransformation.family;

import java.util.ArrayList;
import java.util.List;

public class Family {

    private final List<FamilyMember> familyMembers = new ArrayList<>();

    public List<FamilyMember> getFamilyMembers() {
        return new ArrayList<>(familyMembers);
    }

    public List<Integer> getAgesOfFamilyMembersWithNameGiven(String name) {
        return familyMembers.stream()
                .filter(fm -> fm.name().split(" ")[1].equals(name))
                .map(FamilyMember::age)
                .toList();
//        List<Integer> ages = new ArrayList<>();
//        for (FamilyMember familyMember : familyMembers) {
//            if (firstName.equals(name)) ages.add(familyMember.getAge());
//            String firstName = familyMember.getName().split(" ")[1];
//        }
//        return ages;
    }

    public void addFamilyMember(FamilyMember familyMember) {
        familyMembers.add(familyMember);
    }
}
