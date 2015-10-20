package fr.minint.sief.web.rest.dto;

import java.io.Serializable;

/**
 * A DTO for the Demande count.
 */
public class DemandeCountDTO implements Serializable {
	
	private static final long serialVersionUID = -8061995948732515536L;
	
	private Long nbPaid = 0L;
	private Long nbScheduled = 0L;
    private Long nbIdentityVerified = 0L;

	public Long getNbPaid() {
		return nbPaid;
	}

	public void setNbPaid(Long nbPaid) {
		this.nbPaid = nbPaid;
	}

	public Long getNbScheduled() {
		return nbScheduled;
	}

	public void setNbScheduled(Long nbScheduled) {
		this.nbScheduled = nbScheduled;
	}

	public Long getNbIdentityVerified() {
		return nbIdentityVerified;
	}

	public void setNbIdentityVerified(Long nbIdentityVerified) {
		this.nbIdentityVerified = nbIdentityVerified;
	}

	@Override
    public String toString() {
        return "DemandeCountDTO{" +
                "nbPaid='" + nbPaid + "'" +
                ", nbScheduled='" + nbScheduled + "'" +
                ", nbIdentityVerified='" + nbIdentityVerified + "'" +
                '}';
    }
}
