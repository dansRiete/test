package recursion;

import java.util.List;

public class SegmentDefinition {
    private String op;
    private String fieldType;
    private String fieldId;
    private String actionTypeId;
    private String negated;
    private String operatorId;
    private String parameter1;
    private String parameter2;
    private List<SegmentDefinition> criteria;

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
    }

    public String getFieldType() {
        return fieldType;
    }

    public void setFieldType(String fieldType) {
        this.fieldType = fieldType;
    }

    public String getFieldId() {
        return fieldId;
    }

    public void setFieldId(String fieldId) {
        this.fieldId = fieldId;
    }

    public String getActionTypeId() {
        return actionTypeId;
    }

    public void setActionTypeId(String actionTypeId) {
        this.actionTypeId = actionTypeId;
    }

    public String getNegated() {
        return negated;
    }

    public void setNegated(String negated) {
        this.negated = negated;
    }

    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    public String getParameter1() {
        return parameter1;
    }

    public void setParameter1(String parameter1) {
        this.parameter1 = parameter1;
    }

    public String getParameter2() {
        return parameter2;
    }

    public void setParameter2(String parameter2) {
        this.parameter2 = parameter2;
    }

    public List<SegmentDefinition> getCriteria() {
        return criteria;
    }

    public void setCriteria(
            List<SegmentDefinition> criteria) {
        this.criteria = criteria;
    }

    @Override public String toString() {
        return fieldId + " " + operatorId + " " + parameter1;
    }
}
