package org.apromore.canoniser.bpmn.anf;

// Local packages
import org.apromore.anf.AnnotationType;
import org.apromore.canoniser.bpmn.IdFactory;
import org.omg.spec.bpmn._20100524.di.BPMNEdge;
import org.omg.spec.bpmn._20100524.di.BPMNShape;

/**
 * ANF 0.3 annotation element.
 *
 * @author <a href="mailto:simon.raboczi@uqconnect.edu.au">Simon Raboczi</a>
 */
public class AnfAnnotationType extends AnnotationType {

    /** No-arg constructor. */
    public AnfAnnotationType() {
        super();
    }

    /**
     * Construct an annotation for a BPMNDI Edge.
     *
     * @param edge  a BPMNDI Edge
     * @param anfIdFactory  generator for identifiers
     */
    public AnfAnnotationType(final BPMNEdge edge, final IdFactory anfIdFactory) {
        setId(anfIdFactory.newId(edge.getId()));
        setCpfId(edge.getBpmnElement().getLocalPart());  // TODO - process through cpfIdFactory instead
    }

    /**
     * Construct an annotation for a BPMNDI Shape.
     *
     * @param shape  a BPMNDI Shape
     * @param anfIdFactory  generator for identifiers
     */
    public AnfAnnotationType(final BPMNShape shape, final IdFactory anfIdFactory) {
        setId(anfIdFactory.newId(shape.getId()));
        setCpfId(shape.getBpmnElement().getLocalPart());  // TODO - process through cpfIdFactory instead
    }
}
