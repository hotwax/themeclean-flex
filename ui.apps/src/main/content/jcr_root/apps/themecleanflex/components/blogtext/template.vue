<template>
  <div class="flex min-h-1 container mx-auto" v-bind:data-per-path="model.path">
    <div class="w-full flex flex-col md:-mx-3">
      <div class="flex-grow md:px-3" v-html="model.text"></div>
    </div>
  </div>
</template>

<script>
    export default {
        props: ['model']
    }
</script>

