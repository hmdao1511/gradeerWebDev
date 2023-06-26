package com.example.gradeerWeb.gradeerConfig;

import jakarta.persistence.*;

@Entity
@Table(name = "gradeerConfig")
public class GradeerConfig {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String studentSolutionDirPath;

    @Column(nullable = false)
    private String outputDirPath;

    @Column(nullable = false)
    private String modelSolutionsDirPath;

    @Column(nullable = false)
    private String testsDirPath;

    @Column(nullable = false)
    private String junitVersion;

    @Column(nullable = false)
    private Boolean forceRecompilation;

    @Column(nullable = false)
    private String sourceDependenciesDirPath;

    @Column(nullable = false)
    private String runtimeDependenciesDirPath;

    @Column(nullable = false)
    private String checkJSONs; // only one checkJson file is allowed

    @Column(nullable = false)
    private double perTestSuiteTimeout;

    @Column(nullable = false)
    private double tabWidth;

    // This part is the "preManualJavaClassesToExecute" attribute that returns a JSON
    @Column(nullable = false)
    private String fullClassName;

    @Column(nullable = false)
    private String args;

    @Column(nullable = false)
    private String additionalCPElems;

    @Column(nullable = false)
    private double waitAfterExecutionTime;

    @Column(nullable = false)
    private String inspectCommand;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStudentSolutionDirPath() {
        return studentSolutionDirPath;
    }

    public void setStudentSolutionDirPath(String studentSolutionDirPath) {
        this.studentSolutionDirPath = studentSolutionDirPath;
    }

    public String getOutputDirPath() {
        return outputDirPath;
    }

    public void setOutputDirPath(String outputDirPath) {
        this.outputDirPath = outputDirPath;
    }

    public String getModelSolutionsDirPath() {
        return modelSolutionsDirPath;
    }

    public void setModelSolutionsDirPath(String modelSolutionsDirPath) {
        this.modelSolutionsDirPath = modelSolutionsDirPath;
    }

    public String getTestsDirPath() {
        return testsDirPath;
    }

    public void setTestsDirPath(String testsDirPath) {
        this.testsDirPath = testsDirPath;
    }

    public String getJunitVersion() {
        return junitVersion;
    }

    public void setJunitVersion(String junitVersion) {
        this.junitVersion = junitVersion;
    }

    public Boolean getForceRecompilation() {
        return forceRecompilation;
    }

    public void setForceRecompilation(Boolean forceRecompilation) {
        this.forceRecompilation = forceRecompilation;
    }

    public String getSourceDependenciesDirPath() {
        return sourceDependenciesDirPath;
    }

    public void setSourceDependenciesDirPath(String sourceDependenciesDirPath) {
        this.sourceDependenciesDirPath = sourceDependenciesDirPath;
    }

    public String getRuntimeDependenciesDirPath() {
        return runtimeDependenciesDirPath;
    }

    public void setRuntimeDependenciesDirPath(String runtimeDependenciesDirPath) {
        this.runtimeDependenciesDirPath = runtimeDependenciesDirPath;
    }

    public String getCheckJSONs() {
        return checkJSONs;
    }

    public void setCheckJSONs(String checkJSONs) {
        this.checkJSONs = checkJSONs;
    }

    public double getPerTestSuiteTimeout() {
        return perTestSuiteTimeout;
    }

    public void setPerTestSuiteTimeout(double perTestSuiteTimeout) {
        this.perTestSuiteTimeout = perTestSuiteTimeout;
    }

    public double getTabWidth() {
        return tabWidth;
    }

    public void setTabWidth(double tabWidth) {
        this.tabWidth = tabWidth;
    }

    public String getFullClassName() {
        return fullClassName;
    }

    public void setFullClassName(String fullClassName) {
        this.fullClassName = fullClassName;
    }

    public String getArgs() {
        return args;
    }

    public void setArgs(String args) {
        this.args = args;
    }

    public String getAdditionalCPElems() {
        return additionalCPElems;
    }

    public void setAdditionalCPElems(String additionalCPElems) {
        this.additionalCPElems = additionalCPElems;
    }

    public double getWaitAfterExecutionTime() {
        return waitAfterExecutionTime;
    }

    public void setWaitAfterExecutionTime(double waitAfterExecutionTime) {
        this.waitAfterExecutionTime = waitAfterExecutionTime;
    }

    public String getInspectCommand() {
        return inspectCommand;
    }

    public void setInspectCommand(String inspectCommand) {
        this.inspectCommand = inspectCommand;
    }
}
