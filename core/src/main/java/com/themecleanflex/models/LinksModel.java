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
    "Links": {
      "type": "object",
      "x-type": "component",
      "properties": {
        "links": {
          "type": "string",
          "x-source": "inject",
          "x-form-label": "Please enter internal link or externalurl",
          "x-form-fieldLabel": "title",
          "x-form-type": "collection",
          "properties": {
            "title": {
              "type": "string",
              "x-source": "inject",
              "x-form-label": "Title",
              "x-form-type": "text"
            },
            "internallink": {
              "type": "string",
              "x-source": "inject",
              "x-form-label": "Internal link",
              "x-form-type": "pathbrowser",
              "x-form-browserRoot": ""
            },
            "externalurl": {
              "type": "string",
              "x-source": "inject",
              "x-form-label": "External Url(with http protocol)",
              "x-form-type": "url"
            }
          }
        }
      }
    }
  },
  "name": "Links",
  "componentPath": "themecleanflex/components/links",
  "package": "com.themecleanflex.models",
  "modelName": "Links",
  "classNameParent": "AbstractComponent"
}
//GEN]
*/

//GEN[:DEF
@Model(
        adaptables = Resource.class,
        resourceType = "themecleanflex/components/links",
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL,
        adapters = IComponent.class
)
@Exporter(
        name = "jackson",
        extensions = "json"
)

//GEN]
public class LinksModel extends AbstractComponent {

    public LinksModel(Resource r) { super(r); }

    //GEN[:INJECT
    	/* {"type":"string","x-source":"inject","x-form-label":"Please enter internal link or externalurl","x-form-fieldLabel":"title","x-form-type":"collection","properties":{"title":{"type":"string","x-source":"inject","x-form-label":"Title","x-form-type":"text"},"internallink":{"type":"string","x-source":"inject","x-form-label":"Internal link","x-form-type":"pathbrowser","x-form-browserRoot":""},"externalurl":{"type":"string","x-source":"inject","x-form-label":"External Url(with http protocol)","x-form-type":"url"}}} */
	@Inject
	private List<IComponent> links;


//GEN]

    //GEN[:GETTERS
    	/* {"type":"string","x-source":"inject","x-form-label":"Please enter internal link or externalurl","x-form-fieldLabel":"title","x-form-type":"collection","properties":{"title":{"type":"string","x-source":"inject","x-form-label":"Title","x-form-type":"text"},"internallink":{"type":"string","x-source":"inject","x-form-label":"Internal link","x-form-type":"pathbrowser","x-form-browserRoot":""},"externalurl":{"type":"string","x-source":"inject","x-form-label":"External Url(with http protocol)","x-form-type":"url"}}} */
	public List<IComponent> getLinks() {
		return links;
	}


//GEN]

    //GEN[:CUSTOMGETTERS
    //GEN]

}
