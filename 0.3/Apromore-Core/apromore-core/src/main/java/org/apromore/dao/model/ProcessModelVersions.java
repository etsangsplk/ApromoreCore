package org.apromore.dao.model;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.springframework.beans.factory.annotation.Configurable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * ProcessModelVersions generated by hbm2java
 */
@Entity
@Table(name = "process_model_versions")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Configurable("process_model_versions")
public class ProcessModelVersions implements Serializable {

    /**
     * Hard coded for interoperability.
     */
    private static final long serialVersionUID = -1172538404638485548L;

    private String processModelVersionId;
    private String rootFragmentVersionId;
    private Integer versionNumber;
    private String versionName;
    private Integer changePropagation;
    private Integer lockStatus;
    private Integer numVertices;
    private Integer numEdges;

    private ProcessBranches processBranches;
    private Set<ProcessFragmentMap> processFragmentMaps = new HashSet<ProcessFragmentMap>(0);
    private Set<ProcessBranches> processBranchesesForCurrentProcessModelVersionId = new HashSet<ProcessBranches>(0);
    private Set<ProcessBranches> processBranchesesForSourceProcessModelVersionId = new HashSet<ProcessBranches>(0);


    public ProcessModelVersions() { }


    @Id
    @Column(name = "process_model_version_id", unique = true, nullable = false, length = 40)
    public String getProcessModelVersionId() {
        return this.processModelVersionId;
    }

    public void setProcessModelVersionId(String processModelVersionId) {
        this.processModelVersionId = processModelVersionId;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "branch_id")
    public ProcessBranches getProcessBranches() {
        return this.processBranches;
    }

    public void setProcessBranches(ProcessBranches processBranches) {
        this.processBranches = processBranches;
    }


    @Column(name = "root_fragment_version_id", length = 40)
    public String getRootFragmentVersionId() {
        return this.rootFragmentVersionId;
    }

    public void setRootFragmentVersionId(String rootFragmentVersionId) {
        this.rootFragmentVersionId = rootFragmentVersionId;
    }


    @Column(name = "version_number")
    public Integer getVersionNumber() {
        return this.versionNumber;
    }

    public void setVersionNumber(Integer versionNumber) {
        this.versionNumber = versionNumber;
    }


    @Column(name = "version_name", length = 200)
    public String getVersionName() {
        return this.versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }


    @Column(name = "change_propagation")
    public Integer getChangePropagation() {
        return this.changePropagation;
    }

    public void setChangePropagation(Integer changePropagation) {
        this.changePropagation = changePropagation;
    }


    @Column(name = "lock_status")
    public Integer getLockStatus() {
        return this.lockStatus;
    }

    public void setLockStatus(Integer lockStatus) {
        this.lockStatus = lockStatus;
    }


    @Column(name = "num_vertices")
    public Integer getNumVertices() {
        return this.numVertices;
    }

    public void setNumVertices(Integer numVertices) {
        this.numVertices = numVertices;
    }


    @Column(name = "num_edges")
    public Integer getNumEdges() {
        return this.numEdges;
    }

    public void setNumEdges(Integer numEdges) {
        this.numEdges = numEdges;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "processModelVersions")
    public Set<ProcessFragmentMap> getProcessFragmentMaps() {
        return this.processFragmentMaps;
    }

    public void setProcessFragmentMaps(Set<ProcessFragmentMap> processFragmentMaps) {
        this.processFragmentMaps = processFragmentMaps;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "processModelVersionsByCurrentProcessModelVersionId")
    public Set<ProcessBranches> getProcessBranchesesForCurrentProcessModelVersionId() {
        return this.processBranchesesForCurrentProcessModelVersionId;
    }

    public void setProcessBranchesesForCurrentProcessModelVersionId(Set<ProcessBranches> processBranchesesForCurrentProcessModelVersionId) {
        this.processBranchesesForCurrentProcessModelVersionId = processBranchesesForCurrentProcessModelVersionId;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "processModelVersionsBySourceProcessModelVersionId")
    public Set<ProcessBranches> getProcessBranchesesForSourceProcessModelVersionId() {
        return this.processBranchesesForSourceProcessModelVersionId;
    }

    public void setProcessBranchesesForSourceProcessModelVersionId(Set<ProcessBranches> processBranchesesForSourceProcessModelVersionId) {
        this.processBranchesesForSourceProcessModelVersionId = processBranchesesForSourceProcessModelVersionId;
    }

}

