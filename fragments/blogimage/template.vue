<template>
  <div v-bind:data-per-path="model.path">
    <img alt="Nature" class="responsive" width="600" height="400" v-bind:src="model.image">
  </div>
</template>

<script>
    export default {
        props: ['model']
    }
</script>

