package Utils.models;

import java.util.Objects;

public class StudentResultModel {

    private final String methodName;
    private final boolean isSuccess;
    private final String instanceName;

    public StudentResultModel(String name, boolean isSuccess, String instanceName) {
        this.methodName = name;
        this.isSuccess = isSuccess;
        this.instanceName = instanceName;
    }

    public String getMethodName() {
        return methodName;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public String getInstanceName() {
        return instanceName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentResultModel that = (StudentResultModel) o;
        return isSuccess == that.isSuccess && methodName.equals(that.methodName) && instanceName.equals(that.instanceName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(methodName, isSuccess, instanceName);
    }
}
