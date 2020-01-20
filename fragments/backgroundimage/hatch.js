module.exports = {
    convert: function($, f) {
        f.bindAttribute( $, 'class', '[classes, colors, model.component]', false)
        f.bindAttribute( $, 'style', '[styles, sticky]', false)
        f.bindAttribute( $, 'data-per-path', 'model.path')
        f.addStyle( $.find('div.embed-responsive').first(), 'position', "'absolute'")
        f.addStyle( $.find('div.embed-responsive').first(), 'pointer-events', "'none'")
        f.addStyle( $.find('div.embed-responsive').first(), 'z-index', "'-1'")
        $.find('div.flex').append( '<slot>')
    }
}