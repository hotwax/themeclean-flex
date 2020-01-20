<template>
  <component class="w-full px-5 flex flex-col justify-center" ref="section"
  v-bind:class="[classes, colors, model.component]" v-bind:style="[styles, sticky]"
  v-bind:data-per-path="model.path">
    <div class="embed-responsive embed-responsive-16by9 w-full h-full top-0 left-0"
    v-bind:style="`position:${'absolute'};pointer-events:${'none'};z-index:${'-1'};`"></div>
    <div class="flex min-h-1 container mx-auto">
      <slot></slot>
    </div>
  </component>
</template>

<script>
    export default {
        props: {
          model: {
            type: Object
            }
        },
        computed: {
            styles: function() {
                let styles = {}
                styles.paddingTop = `239px`;
                styles.paddingBottom = `239px`;
                styles.position = 'relative';
                styles.overflow = 'hidden';
                styles.background = `url("${this.model.image}")`;
                styles.backgroundRepeat = 'no-repeat';
                styles.backgroundSize = 'cover';

                return styles;
            }
        }
    }
</script>

