package org.team100.roboticists;




public class Dave implements Roboticist {

    @Override
    public type getType() {
        return type.MENTOR;
    }

    @Override
    public String getName() {
        return "Dave";
    }

    @Override
    public int getStudentId() {
        return 0;
    }

    @Override
    public String getSpecialTalent() {
        return "Grammar nitpicks";
    }

}


