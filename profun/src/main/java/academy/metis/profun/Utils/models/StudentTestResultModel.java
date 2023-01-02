package academy.metis.profun.Utils.models;

import java.util.Objects;

public class StudentTestResultModel {

    private final String methodName;
    private final boolean isSuccess;
    private final String className;

    public StudentTestResultModel(String name, boolean isSuccess, String className) {
        this.methodName = name;
        this.isSuccess = isSuccess;
        this.className = className;
    }

    public String getMethodName() {
        return methodName;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public String getClassName() {
        return className;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentTestResultModel that = (StudentTestResultModel) o;
        return isSuccess == that.isSuccess && methodName.equals(that.methodName) && className.equals(that.className);
    }

    @Override
    public int hashCode() {
        return Objects.hash(methodName, isSuccess, className);
    }
}
