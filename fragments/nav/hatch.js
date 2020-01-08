module.exports = {
    convert: function($, f) {
        f.bindPath($)
        f.addChildren($)
        f.addPlaceholders($)
        f.mapRichField($.find('span'), "model.title")
    }
}