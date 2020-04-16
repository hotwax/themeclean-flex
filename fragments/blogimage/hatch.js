module.exports = {
    convert: function($, f) {
        f.bindPath($)
        f.bindAttribute($.find('img').first(), 'src', 'model.image')
    }
}