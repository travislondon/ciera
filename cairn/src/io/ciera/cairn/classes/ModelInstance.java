package io.ciera.cairn.classes;

import io.ciera.cairn.types.UniqueId;
import io.ciera.summit.classes.IInstanceIdentifier;
import io.ciera.summit.classes.IModelInstance;
import io.ciera.summit.components.IComponent;
import io.ciera.summit.exceptions.DeletedInstanceException;
import io.ciera.summit.exceptions.InstancePopulationException;
import io.ciera.summit.exceptions.XtumlException;
import io.ciera.summit.types.IXtumlType;
import io.ciera.summit.types.IUniqueId;

public abstract class ModelInstance<T extends IModelInstance<T,C>,C extends IComponent<C>> implements IModelInstance<T,C> {
    

    private IUniqueId instanceId;

    // constructors
    public ModelInstance() {
        instanceId = new UniqueId();
    }
    
    @Override
    public IUniqueId getInstanceId() {
        return instanceId;
    }
    
    @Override
    public void checkLiving() throws XtumlException {
        if ( instanceId.isNull() ) throw new DeletedInstanceException( "Access of deleted instance " );
    }
    
    @Override
    public void delete() throws XtumlException {
        checkLiving();
        instanceId.nullify();
        if ( !population().removeInstance( this ) ) throw new InstancePopulationException( "Instance does not exist within this population." );
    }

    @Override
    public boolean equals( Object obj ) {
    	if ( null != obj && obj instanceof IModelInstance<?,?> ) {
    		return getKeyLetters().equals( ((IModelInstance<?,?>)obj).getKeyLetters() ) &&
    			   getInstanceId().equals( ((IModelInstance<?,?>)obj).getInstanceId() ) &&
    		       ( null == getId1() || getId1().equals( ((IModelInstance<?,?>)obj).getId1() ) ) &&
    		       ( null == getId2() || getId2().equals( ((IModelInstance<?,?>)obj).getId2() ) ) &&
    		       ( null == getId3() || getId3().equals( ((IModelInstance<?,?>)obj).getId3() ) );
    	}
    	else return false;
    }
    
    @Override
    public int hashCode() {
    	int hash = getKeyLetters().hashCode();
    	hash = hash * 31 + getInstanceId().hashCode();
    	if ( null != getId1() ) hash = hash * 31 + getId1().hashCode();
    	if ( null != getId2() ) hash = hash * 31 + getId2().hashCode();
    	if ( null != getId3() ) hash = hash * 31 + getId3().hashCode();
    	return hash;
    }
    
	@Override
	public IInstanceIdentifier getId1() {
		return null;
	}

	@Override
	public IInstanceIdentifier getId2() {
		return null;
	}

	@Override
	public IInstanceIdentifier getId3() {
		return null;
	}
	
	@Override
	public boolean equality( IXtumlType<T> value) throws XtumlException {
		return equals( value );
	}

}