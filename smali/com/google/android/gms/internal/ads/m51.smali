.class public final Lcom/google/android/gms/internal/ads/m51;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/r42;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ads/r42<",
        "Lcom/google/android/gms/internal/ads/i51;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/e52;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/e52<",
            "Landroid/content/pm/ApplicationInfo;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lcom/google/android/gms/internal/ads/e52;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/e52<",
            "Landroid/content/pm/PackageInfo;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/ads/e52;Lcom/google/android/gms/internal/ads/e52;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ads/e52<",
            "Landroid/content/pm/ApplicationInfo;",
            ">;",
            "Lcom/google/android/gms/internal/ads/e52<",
            "Landroid/content/pm/PackageInfo;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/m51;->a:Lcom/google/android/gms/internal/ads/e52;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/m51;->b:Lcom/google/android/gms/internal/ads/e52;

    return-void
.end method

.method public static a(Landroid/content/pm/ApplicationInfo;Landroid/content/pm/PackageInfo;)Lcom/google/android/gms/internal/ads/i51;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/i51;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/ads/i51;-><init>(Landroid/content/pm/ApplicationInfo;Landroid/content/pm/PackageInfo;)V

    return-object v0
.end method

.method public static a(Lcom/google/android/gms/internal/ads/e52;Lcom/google/android/gms/internal/ads/e52;)Lcom/google/android/gms/internal/ads/m51;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ads/e52<",
            "Landroid/content/pm/ApplicationInfo;",
            ">;",
            "Lcom/google/android/gms/internal/ads/e52<",
            "Landroid/content/pm/PackageInfo;",
            ">;)",
            "Lcom/google/android/gms/internal/ads/m51;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/ads/m51;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/ads/m51;-><init>(Lcom/google/android/gms/internal/ads/e52;Lcom/google/android/gms/internal/ads/e52;)V

    return-object v0
.end method


# virtual methods
.method public final synthetic get()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/m51;->a:Lcom/google/android/gms/internal/ads/e52;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/e52;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/ApplicationInfo;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/m51;->b:Lcom/google/android/gms/internal/ads/e52;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/e52;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/pm/PackageInfo;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/m51;->a(Landroid/content/pm/ApplicationInfo;Landroid/content/pm/PackageInfo;)Lcom/google/android/gms/internal/ads/i51;

    move-result-object v0

    return-object v0
.end method
