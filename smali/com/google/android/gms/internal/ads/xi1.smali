.class public final Lcom/google/android/gms/internal/ads/xi1;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Landroid/os/Looper;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/xi1;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/xi1;->b:Landroid/os/Looper;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 3

    invoke-static {}, Lcom/google/android/gms/internal/ads/mj1;->p()Lcom/google/android/gms/internal/ads/mj1$b;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/xi1;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/mj1$b;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/mj1$b;

    sget-object v1, Lcom/google/android/gms/internal/ads/mj1$a;->d:Lcom/google/android/gms/internal/ads/mj1$a;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/mj1$b;->a(Lcom/google/android/gms/internal/ads/mj1$a;)Lcom/google/android/gms/internal/ads/mj1$b;

    invoke-static {}, Lcom/google/android/gms/internal/ads/fj1;->p()Lcom/google/android/gms/internal/ads/fj1$b;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/fj1$b;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/fj1$b;

    sget-object p1, Lcom/google/android/gms/internal/ads/fj1$a;->d:Lcom/google/android/gms/internal/ads/fj1$a;

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/fj1$b;->a(Lcom/google/android/gms/internal/ads/fj1$a;)Lcom/google/android/gms/internal/ads/fj1$b;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/mj1$b;->a(Lcom/google/android/gms/internal/ads/fj1$b;)Lcom/google/android/gms/internal/ads/mj1$b;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/rz1$a;->e()Lcom/google/android/gms/internal/ads/c12;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/rz1;

    check-cast p1, Lcom/google/android/gms/internal/ads/mj1;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/xi1;->a:Landroid/content/Context;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/xi1;->b:Landroid/os/Looper;

    new-instance v2, Lcom/google/android/gms/internal/ads/wi1;

    invoke-direct {v2, v0, v1, p1}, Lcom/google/android/gms/internal/ads/wi1;-><init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/internal/ads/mj1;)V

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/wi1;->a()V

    return-void
.end method
