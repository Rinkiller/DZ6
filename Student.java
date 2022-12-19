public class Student {
    private String name;
    private double averageScore;
    public Student(String name, Double averageScore) {
        this.name = name;
        this.averageScore = averageScore;
    }
    public String getName() {
        return name;
    }
    public double getAverageScore() {
        return averageScore;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAverageScore(float averageScore) {
        this.averageScore = averageScore;
    }
    @Override
    public String toString() {
        return "Student [name=" + name + ", averageScore=" + averageScore + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        long temp;
        temp = Double.doubleToLongBits(averageScore);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (Double.doubleToLongBits(averageScore) != Double.doubleToLongBits(other.averageScore))
            return false;
        return true;
    }
    
}
