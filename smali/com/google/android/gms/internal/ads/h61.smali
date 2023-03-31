.class public final Lcom/google/android/gms/internal/ads/h61;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/y61;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ads/y61<",
        "Lcom/google/android/gms/internal/ads/i61;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/ko1;

.field private final b:Landroid/content/Context;

.field private final c:Lcom/google/android/gms/internal/ads/fo;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/ko1;Landroid/content/Context;Lcom/google/android/gms/internal/ads/fo;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/h61;->a:Lcom/google/android/gms/internal/ads/ko1;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/h61;->b:Landroid/content/Context;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/h61;->c:Lcom/google/android/gms/internal/ads/fo;

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/internal/ads/lo1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/internal/ads/lo1<",
            "Lcom/google/android/gms/internal/ads/i61;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/h61;->a:Lcom/google/android/gms/internal/ads/ko1;

    new-instance v1, Lcom/google/android/gms/internal/ads/k61;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/k61;-><init>(Lcom/google/android/gms/internal/ads/h61;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/ko1;->a(Ljava/util/concurrent/Callable;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object v0

    return-object v0
.end method

.method final synthetic b()Lcom/google/android/gms/internal/ads/i61;
    .locals 10

    new-instance v8, Lcom/google/android/gms/internal/ads/i61;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/h61;->b:Landroid/content/Context;

    invoke-static {v0}, Lb/c/b/a/c/q/c;->a(Landroid/content/Context;)Lb/c/b/a/c/q/b;

    move-result-object v0

    invoke-virtual {v0}, Lb/c/b/a/c/q/b;->a()Z

    move-result v1

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->c()Lcom/google/android/gms/internal/ads/gl;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/h61;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/gl;->k(Landroid/content/Context;)Z

    move-result v2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/h61;->c:Lcom/google/android/gms/internal/ads/fo;

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/fo;->b:Ljava/lang/String;

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->e()Lcom/google/android/gms/internal/ads/ll;

    invoke-static {}, Lcom/google/android/gms/internal/ads/ll;->e()Z

    move-result v4

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->c()Lcom/google/android/gms/internal/ads/gl;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/h61;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/gl;->h(Landroid/content/Context;)I

    move-result v5

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/h61;->b:Landroid/content/Context;

    const-string v6, "com.google.android.gms.ads.dynamite"

    invoke-static {v0, v6}, Lcom/google/android/gms/dynamite/DynamiteModule;->b(Landroid/content/Context;Ljava/lang/String;)I

    move-result v7

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/h61;->b:Landroid/content/Context;

    invoke-static {v0, v6}, Lcom/google/android/gms/dynamite/DynamiteModule;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v9

    move-object v0, v8

    move v6, v7

    move v7, v9

    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/internal/ads/i61;-><init>(ZZLjava/lang/String;ZIII)V

    return-object v8
.end method
