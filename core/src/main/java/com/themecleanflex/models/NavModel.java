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
    "Nav": {
      "type": "object",
      "x-type": "container",
      "properties": {
        "title": {
          "type": "string",
          "x-source": "inject",
          "x-form-label": "Title",
          "x-form-type": "text"
        },
        "link": {
          "type": "string",
          "x-source": "inject",
          "x-form-label": "link",
          "x-form-type": "pathbrowser",
          "x-form-browserRoot": "/context/sites"
        }
      }
    }
  },
  "name": "Nav",
  "componentPath": "themecleanflex/components/nav",
  "package": "com.themecleanflex.models",
  "modelName": "Nav",
  "classNameParent": "AbstractComponent"
}
//GEN]
*/

//GEN[:DEF
@Model(
        adaptables = Resource.class,
        resourceType = "themecleanflex/components/nav",
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL,
        adapters = IComponent.class
)
@Exporter(
        name = "jackson",
        extensions = "json"
)

//GEN]
public class NavModel extends Container {

    public NavModel(Resource r) { super(r); }

    //GEN[:INJECT
    	/* {"type":"string","x-source":"inject","x-form-label":"Title","x-form-type":"text"} */
	@Inject
	private String title;

	/* {"type":"string","x-source":"inject","x-form-label":"link","x-form-type":"pathbrowser","x-form-browserRoot":"/context/sites"} */
	@Inject
	private String link;

	@Inject
	private String linkType;


//GEN]

    //GEN[:GETTERS
    	/* {"type":"string","x-source":"inject","x-form-label":"Title","x-form-type":"text"} */
	public String getTitle() {
		return title;
	}

	/* {"type":"string","x-source":"inject","x-form-label":"link","x-form-type":"pathbrowser","x-form-browserRoot":"/context/sites"} */
	public String getLink() {
		return link;
	}

	public String getLinkType(){ return linkType; }


//GEN]

    //GEN[:CUSTOMGETTERS
    //GEN]

}
