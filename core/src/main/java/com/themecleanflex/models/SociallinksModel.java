package com.themecleanflex.models;

import com.peregrine.nodetypes.models.AbstractComponent;
import com.peregrine.nodetypes.models.IComponent;
import com.peregrine.nodetypes.models.Container;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

/*
    //GEN[:DATA
    {
  "definitions": {
    "Sociallinks": {
      "type": "object",
      "x-type": "component",
      "properties": {
        "icons": {
          "type": "object",
          "x-form-type": "collection",
          "x-form-label": "Icons",
          "x-source": "inject",
          "properties": {
            "icon": {
              "type": "string",
              "x-source": "inject",
              "x-form-label": "Icon Name",
              "x-form-type": "text"
            },
            "url": {
              "type": "string",
              "x-source": "inject",
              "x-form-label": "URL",
              "x-form-type": "url"
            }
          }
        }
      }
    }
  },
  "name": "Sociallinks",
  "componentPath": "themecleanflex/components/sociallinks",
  "package": "com.themecleanflex.models",
  "modelName": "Sociallinks",
  "classNameParent": "AbstractComponent"
}
//GEN]
*/

//GEN[:DEF
@Model(
        adaptables = Resource.class,
        resourceType = "themecleanflex/components/sociallinks",
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL,
        adapters = IComponent.class
)
@Exporter(
        name = "jackson",
        extensions = "json"
)

//GEN]
public class SociallinksModel extends AbstractComponent {

    public SociallinksModel(Resource r) { super(r); }

    //GEN[:INJECT
    	/* {"type":"object","x-form-type":"collection","x-form-label":"Icons","x-source":"inject","properties":{"icon":{"type":"string","x-source":"inject","x-form-label":"Icon Name","x-form-type":"text"},"url":{"type":"string","x-source":"inject","x-form-label":"URL","x-form-type":"url"}}} */
	@Inject
	private List<IComponent> icons;


//GEN]

    //GEN[:GETTERS
    	/* {"type":"object","x-form-type":"collection","x-form-label":"Icons","x-source":"inject","properties":{"icon":{"type":"string","x-source":"inject","x-form-label":"Icon Name","x-form-type":"text"},"url":{"type":"string","x-source":"inject","x-form-label":"URL","x-form-type":"url"}}} */
	public List<IComponent> getIcons() {
		return icons;
	}


//GEN]

    //GEN[:CUSTOMGETTERS
    //GEN]

}
