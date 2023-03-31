.class public final Lcom/google/android/gms/internal/ads/q9;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation runtime Ljavax/annotation/ParametersAreNonnullByDefault;
.end annotation


# static fields
.field private static final b:Lcom/google/android/gms/internal/ads/mm;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/mm<",
            "Lcom/google/android/gms/internal/ads/r7;",
            ">;"
        }
    .end annotation
.end field

.field private static final c:Lcom/google/android/gms/internal/ads/mm;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/mm<",
            "Lcom/google/android/gms/internal/ads/r7;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/f8;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/p9;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/p9;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/q9;->b:Lcom/google/android/gms/internal/ads/mm;

    new-instance v0, Lcom/google/android/gms/internal/ads/s9;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/s9;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/q9;->c:Lcom/google/android/gms/internal/ads/mm;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/fo;Ljava/lang/String;)V
    .locals 7

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v6, Lcom/google/android/gms/internal/ads/f8;

    sget-object v4, Lcom/google/android/gms/internal/ads/q9;->b:Lcom/google/android/gms/internal/ads/mm;

    sget-object v5, Lcom/google/android/gms/internal/ads/q9;->c:Lcom/google/android/gms/internal/ads/mm;

    move-object v0, v6

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/f8;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/fo;Ljava/lang/String;Lcom/google/android/gms/internal/ads/mm;Lcom/google/android/gms/internal/ads/mm;)V

    iput-object v6, p0, Lcom/google/android/gms/internal/ads/q9;->a:Lcom/google/android/gms/internal/ads/f8;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lcom/google/android/gms/internal/ads/j9;Lcom/google/android/gms/internal/ads/k9;)Lcom/google/android/gms/internal/ads/i9;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<I:",
            "Ljava/lang/Object;",
            "O:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/ads/j9<",
            "TI;>;",
            "Lcom/google/android/gms/internal/ads/k9<",
            "TO;>;)",
            "Lcom/google/android/gms/internal/ads/i9<",
            "TI;TO;>;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/ads/r9;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/q9;->a:Lcom/google/android/gms/internal/ads/f8;

    invoke-direct {v0, v1, p1, p2, p3}, Lcom/google/android/gms/internal/ads/r9;-><init>(Lcom/google/android/gms/internal/ads/f8;Ljava/lang/String;Lcom/google/android/gms/internal/ads/j9;Lcom/google/android/gms/internal/ads/k9;)V

    return-object v0
.end method

.method public final a()Lcom/google/android/gms/internal/ads/v9;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/v9;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/q9;->a:Lcom/google/android/gms/internal/ads/f8;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/v9;-><init>(Lcom/google/android/gms/internal/ads/f8;)V

    return-object v0
.end method
