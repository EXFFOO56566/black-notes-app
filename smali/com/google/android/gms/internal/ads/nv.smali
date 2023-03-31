.class public Lcom/google/android/gms/internal/ads/nv;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/ads/nv$a;
    }
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/fo;

.field private final b:Landroid/content/Context;

.field private final c:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/ads/nv$a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/nv$a;->a(Lcom/google/android/gms/internal/ads/nv$a;)Lcom/google/android/gms/internal/ads/fo;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/nv;->a:Lcom/google/android/gms/internal/ads/fo;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/nv$a;->b(Lcom/google/android/gms/internal/ads/nv$a;)Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/nv;->b:Landroid/content/Context;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/nv$a;->c(Lcom/google/android/gms/internal/ads/nv$a;)Ljava/lang/ref/WeakReference;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/nv;->c:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/nv$a;Lcom/google/android/gms/internal/ads/mv;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/nv;-><init>(Lcom/google/android/gms/internal/ads/nv$a;)V

    return-void
.end method


# virtual methods
.method final a()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/nv;->b:Landroid/content/Context;

    return-object v0
.end method

.method final b()Ljava/lang/ref/WeakReference;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/ref/WeakReference<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/nv;->c:Ljava/lang/ref/WeakReference;

    return-object v0
.end method

.method final c()Lcom/google/android/gms/internal/ads/fo;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/nv;->a:Lcom/google/android/gms/internal/ads/fo;

    return-object v0
.end method

.method final d()Ljava/lang/String;
    .locals 3

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->c()Lcom/google/android/gms/internal/ads/gl;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/nv;->b:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/nv;->a:Lcom/google/android/gms/internal/ads/fo;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/fo;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/gl;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final e()Lcom/google/android/gms/internal/ads/eq1;
    .locals 4

    new-instance v0, Lcom/google/android/gms/internal/ads/eq1;

    new-instance v1, Lcom/google/android/gms/ads/internal/h;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/nv;->b:Landroid/content/Context;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/nv;->a:Lcom/google/android/gms/internal/ads/fo;

    invoke-direct {v1, v2, v3}, Lcom/google/android/gms/ads/internal/h;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/fo;)V

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/eq1;-><init>(Lcom/google/android/gms/internal/ads/wf1;)V

    return-object v0
.end method
