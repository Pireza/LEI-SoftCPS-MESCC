package org.jeasy.states.samples;

import java.util.Objects;

import org.jeasy.states.api.State;

public class MooreState extends State {
    private final String output;

    public MooreState(String name, String output) {
        super(name);
        this.output = Objects.requireNonNull(output, "Output cannot be null");
    }
    
	public String getOutput() {
	    return output;
	}
	
	@Override
	public String toString() {
	    return super.toString() + ", output='" + output + "'}";
	}
	
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MooreState)) return false;
        if (!super.equals(o)) return false;
        
        MooreState that = (MooreState) o;
        return output.equals(that.output);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), output);
    }
}