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
    "Blogimage": {
      "type": "object",
      "x-type": "component",
      "properties": {
        "image": {
          "type": "string",
          "x-source": "inject",
          "x-form-label": "Image",
          "x-form-type": "pathbrowser",
          "x-form-browserRoot": "/content/assets"
        }
      }
    }
  },
  "name": "Blogimage",
  "componentPath": "themecleanflex/components/blogimage",
  "package": "com.themecleanflex.models",
  "modelName": "Blogimage",
  "classNameParent": "AbstractComponent"
}
//GEN]
*/

//GEN[:DEF
@Model(
        adaptables = Resource.class,
        resourceType = "themecleanflex/components/blogimage",
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL,
        adapters = IComponent.class
)
@Exporter(
        name = "jackson",
        extensions = "json"
)

//GEN]
public class BlogimageModel extends AbstractComponent {

    public BlogimageModel(Resource r) { super(r); }

    //GEN[:INJECT
    	/* {"type":"string","x-source":"inject","x-form-label":"Image","x-form-type":"pathbrowser","x-form-browserRoot":"/content/assets"} */
	@Inject
  private String image;

  @Inject
  private String title;

  @Inject
  private String imageLinkType;

  @Inject
  private String imagealttext;


//GEN]

    //GEN[:GETTERS
    	/* {"type":"string","x-source":"inject","x-form-label":"Image","x-form-type":"pathbrowser","x-form-browserRoot":"/content/assets"} */
	public String getImage() {
		return image;
  }

  public String getTitle() {
    return title;
  }

  public String getImageLinkType() {
    return imageLinkType;
  }

  public String getImageAltText() {
    return imagealttext;
  }


//GEN]

    //GEN[:CUSTOMGETTERS
    //GEN]

}
