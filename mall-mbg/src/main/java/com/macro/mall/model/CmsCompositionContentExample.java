package com.macro.mall.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CmsCompositionContentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CmsCompositionContentExample() {
        oredCriteria = new ArrayList<>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCompositionIdIsNull() {
            addCriterion("composition_id is null");
            return (Criteria) this;
        }

        public Criteria andCompositionIdIsNotNull() {
            addCriterion("composition_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompositionIdEqualTo(Long value) {
            addCriterion("composition_id =", value, "compositionId");
            return (Criteria) this;
        }

        public Criteria andCompositionIdNotEqualTo(Long value) {
            addCriterion("composition_id <>", value, "compositionId");
            return (Criteria) this;
        }

        public Criteria andCompositionIdGreaterThan(Long value) {
            addCriterion("composition_id >", value, "compositionId");
            return (Criteria) this;
        }

        public Criteria andCompositionIdGreaterThanOrEqualTo(Long value) {
            addCriterion("composition_id >=", value, "compositionId");
            return (Criteria) this;
        }

        public Criteria andCompositionIdLessThan(Long value) {
            addCriterion("composition_id <", value, "compositionId");
            return (Criteria) this;
        }

        public Criteria andCompositionIdLessThanOrEqualTo(Long value) {
            addCriterion("composition_id <=", value, "compositionId");
            return (Criteria) this;
        }

        public Criteria andCompositionIdIn(List<Long> values) {
            addCriterion("composition_id in", values, "compositionId");
            return (Criteria) this;
        }

        public Criteria andCompositionIdNotIn(List<Long> values) {
            addCriterion("composition_id not in", values, "compositionId");
            return (Criteria) this;
        }

        public Criteria andCompositionIdBetween(Long value1, Long value2) {
            addCriterion("composition_id between", value1, value2, "compositionId");
            return (Criteria) this;
        }

        public Criteria andCompositionIdNotBetween(Long value1, Long value2) {
            addCriterion("composition_id not between", value1, value2, "compositionId");
            return (Criteria) this;
        }

        public Criteria andContentTypeIsNull() {
            addCriterion("content_Type is null");
            return (Criteria) this;
        }

        public Criteria andContentTypeIsNotNull() {
            addCriterion("content_Type is not null");
            return (Criteria) this;
        }

        public Criteria andContentTypeEqualTo(Integer value) {
            addCriterion("content_Type =", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeNotEqualTo(Integer value) {
            addCriterion("content_Type <>", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeGreaterThan(Integer value) {
            addCriterion("content_Type >", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("content_Type >=", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeLessThan(Integer value) {
            addCriterion("content_Type <", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeLessThanOrEqualTo(Integer value) {
            addCriterion("content_Type <=", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeIn(List<Integer> values) {
            addCriterion("content_Type in", values, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeNotIn(List<Integer> values) {
            addCriterion("content_Type not in", values, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeBetween(Integer value1, Integer value2) {
            addCriterion("content_Type between", value1, value2, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("content_Type not between", value1, value2, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andAudioPathIsNull() {
            addCriterion("audio_path is null");
            return (Criteria) this;
        }

        public Criteria andAudioPathIsNotNull() {
            addCriterion("audio_path is not null");
            return (Criteria) this;
        }

        public Criteria andAudioPathEqualTo(String value) {
            addCriterion("audio_path =", value, "audioPath");
            return (Criteria) this;
        }

        public Criteria andAudioPathNotEqualTo(String value) {
            addCriterion("audio_path <>", value, "audioPath");
            return (Criteria) this;
        }

        public Criteria andAudioPathGreaterThan(String value) {
            addCriterion("audio_path >", value, "audioPath");
            return (Criteria) this;
        }

        public Criteria andAudioPathGreaterThanOrEqualTo(String value) {
            addCriterion("audio_path >=", value, "audioPath");
            return (Criteria) this;
        }

        public Criteria andAudioPathLessThan(String value) {
            addCriterion("audio_path <", value, "audioPath");
            return (Criteria) this;
        }

        public Criteria andAudioPathLessThanOrEqualTo(String value) {
            addCriterion("audio_path <=", value, "audioPath");
            return (Criteria) this;
        }

        public Criteria andAudioPathLike(String value) {
            addCriterion("audio_path like", value, "audioPath");
            return (Criteria) this;
        }

        public Criteria andAudioPathNotLike(String value) {
            addCriterion("audio_path not like", value, "audioPath");
            return (Criteria) this;
        }

        public Criteria andAudioPathIn(List<String> values) {
            addCriterion("audio_path in", values, "audioPath");
            return (Criteria) this;
        }

        public Criteria andAudioPathNotIn(List<String> values) {
            addCriterion("audio_path not in", values, "audioPath");
            return (Criteria) this;
        }

        public Criteria andAudioPathBetween(String value1, String value2) {
            addCriterion("audio_path between", value1, value2, "audioPath");
            return (Criteria) this;
        }

        public Criteria andAudioPathNotBetween(String value1, String value2) {
            addCriterion("audio_path not between", value1, value2, "audioPath");
            return (Criteria) this;
        }

        public Criteria andAudioDurationIsNull() {
            addCriterion("audio_duration is null");
            return (Criteria) this;
        }

        public Criteria andAudioDurationIsNotNull() {
            addCriterion("audio_duration is not null");
            return (Criteria) this;
        }

        public Criteria andAudioDurationEqualTo(Integer value) {
            addCriterion("audio_duration =", value, "audioDuration");
            return (Criteria) this;
        }

        public Criteria andAudioDurationNotEqualTo(Integer value) {
            addCriterion("audio_duration <>", value, "audioDuration");
            return (Criteria) this;
        }

        public Criteria andAudioDurationGreaterThan(Integer value) {
            addCriterion("audio_duration >", value, "audioDuration");
            return (Criteria) this;
        }

        public Criteria andAudioDurationGreaterThanOrEqualTo(Integer value) {
            addCriterion("audio_duration >=", value, "audioDuration");
            return (Criteria) this;
        }

        public Criteria andAudioDurationLessThan(Integer value) {
            addCriterion("audio_duration <", value, "audioDuration");
            return (Criteria) this;
        }

        public Criteria andAudioDurationLessThanOrEqualTo(Integer value) {
            addCriterion("audio_duration <=", value, "audioDuration");
            return (Criteria) this;
        }

        public Criteria andAudioDurationIn(List<Integer> values) {
            addCriterion("audio_duration in", values, "audioDuration");
            return (Criteria) this;
        }

        public Criteria andAudioDurationNotIn(List<Integer> values) {
            addCriterion("audio_duration not in", values, "audioDuration");
            return (Criteria) this;
        }

        public Criteria andAudioDurationBetween(Integer value1, Integer value2) {
            addCriterion("audio_duration between", value1, value2, "audioDuration");
            return (Criteria) this;
        }

        public Criteria andAudioDurationNotBetween(Integer value1, Integer value2) {
            addCriterion("audio_duration not between", value1, value2, "audioDuration");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andReadCountIsNull() {
            addCriterion("read_count is null");
            return (Criteria) this;
        }

        public Criteria andReadCountIsNotNull() {
            addCriterion("read_count is not null");
            return (Criteria) this;
        }

        public Criteria andReadCountEqualTo(Integer value) {
            addCriterion("read_count =", value, "readCount");
            return (Criteria) this;
        }

        public Criteria andReadCountNotEqualTo(Integer value) {
            addCriterion("read_count <>", value, "readCount");
            return (Criteria) this;
        }

        public Criteria andReadCountGreaterThan(Integer value) {
            addCriterion("read_count >", value, "readCount");
            return (Criteria) this;
        }

        public Criteria andReadCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("read_count >=", value, "readCount");
            return (Criteria) this;
        }

        public Criteria andReadCountLessThan(Integer value) {
            addCriterion("read_count <", value, "readCount");
            return (Criteria) this;
        }

        public Criteria andReadCountLessThanOrEqualTo(Integer value) {
            addCriterion("read_count <=", value, "readCount");
            return (Criteria) this;
        }

        public Criteria andReadCountIn(List<Integer> values) {
            addCriterion("read_count in", values, "readCount");
            return (Criteria) this;
        }

        public Criteria andReadCountNotIn(List<Integer> values) {
            addCriterion("read_count not in", values, "readCount");
            return (Criteria) this;
        }

        public Criteria andReadCountBetween(Integer value1, Integer value2) {
            addCriterion("read_count between", value1, value2, "readCount");
            return (Criteria) this;
        }

        public Criteria andReadCountNotBetween(Integer value1, Integer value2) {
            addCriterion("read_count not between", value1, value2, "readCount");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}